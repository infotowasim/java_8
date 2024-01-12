package org.example.ex31PSA.supplier;


// It does not take input but it produce output.


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierFIC {
    public static void main(String[] args) {

        //
        Supplier<Integer> integerSupplier = ()-> 101;
        System.out.println(integerSupplier.get());

        //
        Supplier<String> stringSupplier = ()-> "Mithu";
        System.out.println(stringSupplier.get());

        //
       Supplier<Integer> integerSupplier1 = () -> new Random().nextInt(100);
        System.out.println(integerSupplier1.get());

        // Login and LoginDTO
        List<Login> loginList = Arrays.asList(
                new Login("Mithu", 12345),
                new Login("Sabnam", 43215),
                new Login("Wasim", 98765)
        );

//        List<LoginDTO> loginDTOList = loginList.stream().map(n -> mapToDTO(n)).collect(Collectors.toList());
        List<LoginDTO> loginDTOList = loginList.stream().map(SupplierFIC::mapToDTO).collect(Collectors.toList());


        System.out.println(loginDTOList);


    }

    static LoginDTO mapToDTO(Login login){

        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUserName(login.getUserName());
        loginDTO.setPassword(login.getPassword());
        return loginDTO;
    }




}
