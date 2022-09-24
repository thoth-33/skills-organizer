package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
enum SkillOption
{
	HIDDEN("Hidden", 0,0),
	ONE("Position 1", 0, 0),
	TWO("Position 2", 0,0),
	THREE("Position 3", 0,0),
	FOUR("Position 4", 0,0),
	FIVE("Position 5", 0,0),
	SIX("Position 6", 0,0),
	SEVEN("Position 7", 0,0),
	EIGHT("Position 8", 0,0),
	NINE("Position 9", 0,0),
	TEN("Position 10", 0,0),
	ELEVEN("Position 11", 0,0),
	TWELVE("Position 12", 0,0),
	THIRTEEN("Position 13", 0,0),
	FOURTEEN("Position 14", 0,0),
	FIFTEEN("Position 15", 0,0),
	SIXTEEN("Position 16", 0,0),
	SEVENTEEN("Position 17", 0,0),
	EIGHTEEN("Position 18", 0,0),
	NINETEEN("Position 19", 0,0),
	TWENTY("Position 20", 0,0),
	TWENTY_ONE("Position 21", 0,0),
	TWENTY_TWO("Position 22", 0,0),
	TWENTY_THREE("Position 23", 0,0),
	TWENTY_FOUR("Position 24", 0,0);

	private final String name;
	private final int x;
	private final int y;

	@Override
	public String toString()
	{
		return name;
	}
}
