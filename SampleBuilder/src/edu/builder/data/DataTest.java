
package edu.builder.data;


public class DataTest {
    
    public static void main(String[] args) {
        
        User user = User.create()
                .withEmail("teste@test.com")
                .withName("Joana").build();
        
        user = user.edit().withName("Joana").build();
        System.out.println(user);
    }
    
}
