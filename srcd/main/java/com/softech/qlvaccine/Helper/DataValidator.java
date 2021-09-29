/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.qlvaccine.Helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author leduc
 */
public class DataValidator {
    //Kiểm tra đối tượng được truyền vào JTextField field, chứa thông điệp error tronng sb,  hiển thị ra message error
    public static void validateEmpty (JTextField field, StringBuilder sb, String errorMessage) {
        //kiểm tra dữ liệu nhập trong text field nếu rỗng thì tự thêm ký tự vào cho Stringbuilder, đổi lỗi sang màu đỏ và dí con trỏ chuột tới đó
        //k lỗi thì thông qua và màu trắng
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
    
    
    public static void validateEmpty (JPasswordField field, StringBuilder sb, String errorMessage) {
        String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
}
