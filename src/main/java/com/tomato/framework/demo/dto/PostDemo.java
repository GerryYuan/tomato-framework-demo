package com.tomato.framework.demo.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author gerry
 */
@Data
public class PostDemo implements Serializable {
    private String name;
    
    private Date time;
    
}
