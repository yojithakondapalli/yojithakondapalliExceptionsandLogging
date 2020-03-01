package com.poortoys.examples;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class CompoundIntrest {
	private static final Logger LOGGER = LogManager.getLogger(CompoundIntrest.class);
double compoundInterest(float p,double r,double t)
{
	LOGGER.info("Calculating Compound Interest");
	double res,y;
	y=Math.pow(1+r/100,t);
	res=p*y;
	LOGGER.info("Returning Compound interest");
	return res;
}
}
