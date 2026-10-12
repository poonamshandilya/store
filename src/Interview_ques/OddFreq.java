package Interview_ques;
import java.util.*;

public class OddFreq {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>(
               Arrays.asList(1,2,3,4,2,5,7,3,9,5,7,7)
       );
       HashMap<Integer,Integer> freqMap = new HashMap<>();
       for (Integer num : numbers) {
           if (num % 2 != 0) {
               freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
           }
       }

        System.out.println("odd number with frequencies");
       for (Map.Entry<Integer,Integer>entry : freqMap.entrySet()){
           System.out.println(entry.getKey()+"...."+ entry.getValue());
       }
    }
}
/*
package com.eshop.app.controller1;

import com.eshop.app.dao.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Optional;


@RestController
@RequestMapping("/app2")
public class AppController2 {
    @Autowired
    private AppRepository appRepository;

    @GetMapping("/{id}")
    public String getApp2NameById(@PathVariable String id){


        try{

            int a = Integer.parseInt(id);
            Optional<App> AppData= appRepository.findById(Integer.parseInt(id));
            if (AppData.isPresent()){
                String name= AppData.get().getName();
                return "Name:" +name;
            }else {
                return "user not found";
            }

        } catch (RuntimeException e) {
            throw new RuntimeException("please enter valida data");
        }



    }


}

*/
