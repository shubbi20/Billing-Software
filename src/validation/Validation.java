/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Shubham
 */
public class Validation {
     private Pattern email;
    private Pattern name;
    private Pattern password;
   
    private Matcher matcher;
    private static final String NAME_PATTERN="^[A-Za-z]{3,25}$";
  
    private static final String PASS_PATTERN="^[A-Za-z0-9]{3,25}$";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z-]+(\\.[A-Za-z]+)*(\\.[A-Za-z]{2,3})$";
    public Validation()
    {
        email = Pattern.compile(EMAIL_PATTERN);
        name = Pattern.compile(NAME_PATTERN);
        password=Pattern.compile(PASS_PATTERN);
       
    }
    public boolean emailValidate(final String email1) {
        matcher = email.matcher(email1);
        return matcher.matches();

    }
    
    public boolean nameValidate(final String name1) {
        matcher = name.matcher(name1);
        return matcher.matches();

    }

    public boolean passValidate(final String pass1) {
        matcher = password.matcher(pass1);
        return matcher.matches();

    }

    

    }

