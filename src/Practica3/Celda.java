/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica3;

/**
 *
 * @author alumno
 */
public interface Celda {
    
    public char getTipo();
    
    public boolean tieneCoche();
    
    public void setNextEstado(boolean nextEstadoTieneCoche);

    public void applyNextEstado();
    
    public int getAceleraciones();
    
    @Override
    public String toString();

}
