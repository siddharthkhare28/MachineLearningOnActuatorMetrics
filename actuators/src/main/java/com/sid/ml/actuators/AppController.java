package com.sid.ml.actuators;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> testResponse(){
		//Adding a sleep time to emulate response time of 1 sec
		// Thread.sleep(1000);
		//Adding an IO operation
		ResponseEntity<String> testResponse;
		try {
			File f = new File("D:\\PracticeProjects\\actuators\\testout.txt");
			if(f.exists()){
				FileWriter fw=new FileWriter("D:\\PracticeProjects\\actuators\\testout.txt", true);    
			    PrintWriter printWriter = new PrintWriter(fw);
			    printWriter.println("Write an arbitary sentence.");
			    printWriter.close();
				testResponse = ResponseEntity.ok().body("File written");
			}else{
				testResponse = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("file doesn't exist");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			testResponse = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("failed to write");
		}
		return testResponse;
	}

}
