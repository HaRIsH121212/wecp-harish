package com.wecp.progressive.exception;

<<<<<<< HEAD
public class TeamDoesNotExistException extends RuntimeException{

    public TeamDoesNotExistException(String message)
    {
        super(message);
    }
=======
<<<<<<< HEAD
import java.sql.SQLException;

public class TeamDoesNotExistException extends SQLException {
    public TeamDoesNotExistException (String m){
        super(m);
    }
=======
public class TeamDoesNotExistException {
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}