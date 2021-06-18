/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import beans.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PROPIETARIO
 */
public class UsuarioController {
    private List<Usuario> lstusuario;

    public UsuarioController() {
        this.lstusuario = new ArrayList<Usuario>();     
        cargar();
    }    
    public void add(Usuario usu){
        this.lstusuario.add(usu);
    }
    public Usuario get(int pos){
        return this.lstusuario.get(pos);
    }
    public int size(){
        return this.lstusuario.size();
    }
    public boolean getValidar(String usu,String pass){
        for(int i=0;i<size();i++){
            if(this.lstusuario.get(i).getNomusu().equalsIgnoreCase(usu) && this.lstusuario.get(i).getPasusu().equalsIgnoreCase(pass)){
                return true;            
            }                
        }
        return false;
    }
    /*ver 2.0*/
    public boolean getValidar2(String usu,String pass){
        for(Usuario obj:lstusuario){
            if(obj.getNomusu().equalsIgnoreCase(usu) && obj.getPasusu().equalsIgnoreCase(pass)){
                return true;            
            }                
        }
        return false;
    }
    
   /*Ver 3*/
    public Usuario getValidarObjeto(String usu,String pass){
        for(int i=0;i<size();i++){
            if(this.lstusuario.get(i).getNomusu().equalsIgnoreCase(usu) && this.lstusuario.get(i).getPasusu().equalsIgnoreCase(pass)){
                return this.lstusuario.get(i);
            }                
        }
        return null;
    } 
  public void grabar(){
    try{
        PrintWriter pw;
        String linea;
        pw= new PrintWriter(new FileWriter("usuario.txt"));
        for(int i=0;i<size();i++){
            linea=(lstusuario.get(i).getCodigo() + ";" + 
                      lstusuario.get(i).getNomusu()+";" + 
                      lstusuario.get(i).getPasusu() + ";" +
                      lstusuario.get(i).getTipusu()
                    );
            pw.println(linea);//Agregar el registro al archivo
        }
        pw.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }    
    }
    public void cargar(){
    try{
        BufferedReader br;
        String linea=null;
        String[] array=null;
        br = new BufferedReader(new FileReader("usuario.txt"));
        while((linea = br.readLine()) != null ){
            array = linea.split(";");
            //Crear el objeto de tipo producto con los datos del archivo
             Usuario objusu = 
                    new Usuario(Integer.parseInt(array[0].trim()),array[1].trim(),array[2].trim(),array[3].trim());
            //Agregar el objeto al ArrayList
            this.lstusuario.add(objusu);
        }
        br.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
