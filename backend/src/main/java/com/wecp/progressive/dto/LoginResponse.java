package com.wecp.progressive.dto;

public class LoginResponse {
   private String token;
   private String roles;
   private Integer userId;
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
   public LoginResponse() {
   }
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
   public LoginResponse(String token, String roles, Integer userId) {
      this.token = token;
      this.roles = roles;
      this.userId = userId;
   }
<<<<<<< HEAD

   public String getToken(){
      return token;
   }

   public void setToken(String token){
      this.token = token;
   }

   public String getRoles()
   {
      return roles;
   }

   public void setRole(String roles)
   {
      this.roles = roles;
   }

   public long getUserId()
   {
      return userId;
   }

   public void setUserId(Integer userId)
   {
      this.userId = userId;
   }

=======
   public String getToken() {
      return token;
   }
   public void setToken(String token) {
      this.token = token;
   }
   public String getRoles() {
      return roles;
   }
   public void setRoles(String roles) {
      this.roles = roles;
   }
   public Integer getUserId() {
      return userId;
   }
   public void setUserId(Integer userId) {
      this.userId = userId;
   }
   
>>>>>>> 2cb5e9a49a233acd1ec60d8608d513d5e7b02373
>>>>>>> 1e477257c951fd34a277dae7c497465b61ae0a5b
}
