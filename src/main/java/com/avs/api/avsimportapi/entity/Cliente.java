/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avs.api.avsimportapi.entity;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author pgalarza
 */
@Data
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    
    private Integer id;
    
    private String nombresCompletos;
    
    private String correo;
    
    private String telefono;
}
