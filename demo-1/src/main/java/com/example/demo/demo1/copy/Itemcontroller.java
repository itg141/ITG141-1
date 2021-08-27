package com.example.demo.demo1.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Itemcontroller {
 	 @Autowired
 	 Itemservice is;
 	 @GetMapping("/insert1")
    public List insert()
    {
 		 return is.getAll();
    } 
 	 @PostMapping("/getbyid")
 	 public List GetByOne(@RequestBody Item i)
 	 {
 		 return is.get(i);
 	 }
 	 @PostMapping("/getmultiple")
 	 public List getMultiple(@RequestBody Item i)
 	 {
 		 return is.getMultiple(i);
 	 }
}
