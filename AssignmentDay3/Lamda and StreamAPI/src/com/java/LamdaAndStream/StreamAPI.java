package com.java.LamdaAndStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		//1--blank
		Stream<Object> empty=Stream.empty();
		empty.forEach(e->{
			System.out.println(e);
		});
		
		//stream using array
		String names[]= {"sayan","angan","pallab","shiv","gourav"};
		Stream<String> stream1=Stream.of(names);
		stream1.forEach(e->{
			System.out.println(e);
		});
		
		//1--create a list of string
		//2--use filter function of stream which
		//3--using collector to return list values
		//4--storing in a string list and print it
		List<String> names1=List.of("sayan","angan","pallab","shiv","gourav");
		List<String>newnames=names1.stream().filter(e->e.startsWith("s")).collect(Collectors.toList());
		System.out.println(newnames);
		

	}

}
