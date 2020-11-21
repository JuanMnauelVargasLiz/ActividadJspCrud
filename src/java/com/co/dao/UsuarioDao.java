package com.co.dao;

import com.co.conexion.Conexion;
import com.co.dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioDao {

    private Conexion con;
    private Connection connection;

    public UsuarioDao(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
        System.out.println(jdbcURL);
        con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
    }

    // insertar artículo
    public boolean insertar(Usuario usuario) throws SQLException {
        boolean rowInserted = false;
        try {
            String sql = "INSERT INTO usuario (tipo_identificacion,identificacion,nombre,apellido,telefono,email,fecha_creacion ) VALUES (?, ?, ?,?,?,?,?)";
            System.out.println(usuario.getIdentificacion());
            con.conectar();
            connection = con.getJdbcConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, usuario.getTipoidentificacion());
            statement.setInt(2, usuario.getIdentificacion());
            statement.setString(3, usuario.getNombre());
            statement.setString(4, usuario.getApellido());
            statement.setString(5, usuario.getTelefono());
            statement.setString(6, usuario.getEmail());
            statement.setDate(7, new java.sql.Date(usuario.getFechaCreacion().getTime()));
            rowInserted = statement.executeUpdate() > 0;
            statement.close();
            con.desconectar();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return rowInserted;
    }

    // listar todos los productos
    public List<Usuario> listarUsuario() throws SQLException {
        List<Usuario> listaUsuario = new ArrayList<Usuario>();
        try {
            String sql = "SELECT * FROM usuario";
            con.conectar();
            connection = con.getJdbcConnection();
            Statement statement = connection.createStatement();
            ResultSet resulSet = statement.executeQuery(sql);
            while (resulSet.next()) {
                Integer id = resulSet.getInt("id");
                Integer tipoI = resulSet.getInt("tipo_identificacion");
                Integer identificacion = resulSet.getInt("identificacion");
                String nombre = resulSet.getString("nombre");
                String apellido = resulSet.getString("apellido");
                String telefono = resulSet.getString("telefono");
                String email = resulSet.getString("email");
                Date fechaCreacion = resulSet.getDate("fecha_creacion");
                Usuario usuario = new Usuario(id,identificacion, identificacion, nombre, apellido, telefono, email, fechaCreacion);
                listaUsuario.add(usuario);
            }
            con.desconectar();
        } catch (Exception e) {
            System.out.println("error. " + e.getLocalizedMessage());
        }
        return listaUsuario;
    }

    // obtener por id
    public Usuario obtenerPorId(Integer id) throws SQLException {
        Usuario usuario = null;
        try {
            String sql = "SELECT * FROM usuario WHERE identificacion= ? ";
            con.conectar();
            connection = con.getJdbcConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet res = statement.executeQuery();
            if (res.next()) {
                usuario = new Usuario(res.getInt("tipo_identificacion"), res.getInt("identificacion"), res.getString("nombre"), res.getString("apellido"), res.getString("telefono"), res.getString("email"), res.getDate("fecha_creacion"));
            }
            res.close();
            con.desconectar();
        } catch (Exception e) {
            System.out.println("error: "+e.getLocalizedMessage());
        }
        return usuario;
    }

    // actualizar
    public boolean actualizar(Usuario usuario) throws SQLException {
        boolean rowActualizar = false;
        try {
            String sql = "UPDATE usuario SET tipo_identificacion=?,nombre=?,apellido=?, telefono=?,email=?,fecha_creacion=? WHERE identificacion=?";
            con.conectar();
            connection = con.getJdbcConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, usuario.getTipoidentificacion());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellido());
            statement.setString(4, usuario.getTelefono());
            statement.setString(5, usuario.getEmail());
            statement.setDate(6,new java.sql.Date(usuario.getFechaCreacion().getTime()));           
            statement.setInt(7, usuario.getIdentificacion());
            rowActualizar = statement.executeUpdate() > 0;
            statement.close();
            con.desconectar();
        } catch (Exception e) {
            System.out.println("error: " + e.getLocalizedMessage());
        }
        return rowActualizar;
    }

    //eliminar
    public boolean eliminar(Usuario usuario) throws SQLException {
        boolean rowEliminar = false;
        try {
            String sql = "DELETE FROM usuario WHERE identificacion=?";
            con.conectar();
            connection = con.getJdbcConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, usuario.getIdentificacion());
            rowEliminar = statement.executeUpdate() > 0;
            statement.close();
            con.desconectar();
        } catch (Exception e) {
            System.out.println("error: " + e.getLocalizedMessage());
        }
        return rowEliminar;
    }
}
