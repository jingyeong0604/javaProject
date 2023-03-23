package com.shinhan.day07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor//argument없는 생성자
//@AllArgsConstructor
//@Getter
//@Setter

//@EqualsAndHashCode(of = {"model"})
//@ToString

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"maker"})
@RequiredArgsConstructor //필수는 꼭 들어가야함.
public class Computer {
	
	@NonNull
	private String model;
	private int price;
	private String maker;
	
}
