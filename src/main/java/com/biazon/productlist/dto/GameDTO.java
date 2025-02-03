package com.biazon.productlist.dto;

import lombok.Data;

@Data
public class GameDTO {
	Long id;
	String title;
	Integer year;
	String genre;
	String platforms;
	Double score;
	String imgUrl;
	String shortDescription;
	String longDescription;
}
