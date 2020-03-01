package com.poortoys.examples;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HouseCostConstruction {
	private static final Logger LOGGER = LogManager.getLogger(HouseCostConstruction.class);
float cost(int type,float area)
{
	LOGGER.info("Calculating cost of house");
	float res=0;
	if(type==1)
	{
		res= (float)(1200*area);
	}
	else if(type==2)
	{
		res= (float)(1500*area);
	}
	else if(type==3)
	{
		res= (float)(1800*area);
	}
	else if(type==4)
	{
		res= (float)(2500*area);
	}
	LOGGER.info("Returning cost");
	return Math.round(res);
}
}
