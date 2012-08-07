package com.example.business.calculator;

/*Program: Business Calculator Android Application
  Programmer: Dominque Terry
  Created: 07/21/2012*/


import android.os.Bundle;
import android.app.Activity;
import  android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class BusinessCalculator extends Activity implements OnClickListener
{
	Button profit, unemployRate, PercentChange,GDP,PerCap, PerIncrease, Ereserves, IRates, AFixed, 
	AVariable, ATotal, RWages;
	EditText edit1, edit2;
	 TextView tv1;
	float cost;
	float revenue;
	float ProfitTotal;
	float CurrentPrice;
	float OriginalPrice;
	float PercentChangeTotal;
	float TotalUnemploymentRate;
	float TotalUnemployed;
	float laborForce;
	float RealGDP;
	float NominalGDP;
	float GDPDeflator;
	float PerCapGDP;
	float Gdp;
	float Population;
	float PercentIncrCPI;
	float CPIcurrentYear;
	float CPIpreviousYear;
	float ExcReserves;
	float ActualReserves;
	float RequiredReserves;
	float IntRate;
	float IntPaid;
	float PriceBond;
	float AFC;
	float AVC;
	float ATC;
	float VariableCost;
	float TotalCost;
	float FixedCost;
	float Output;
	float RealWages;
	float MoneyWages;
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_calculator);
        
        //Calls XML variables in activity_main.xml
        edit1 = (EditText) findViewById(R.id.et1);
        edit2= (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv);
        profit = (Button) findViewById(R.id.bprofit);
        unemployRate = (Button) findViewById(R.id.bunemploy);
        PercentChange = (Button) findViewById(R.id.bPercent);
        GDP = (Button) findViewById(R.id.bgdp);
        PerCap = (Button) findViewById(R.id.bpercapia);
        PerIncrease = (Button) findViewById(R.id.bpercentincrease);
        Ereserves = (Button) findViewById(R.id.bEreserves);
        IRates = (Button) findViewById(R.id.bIRates);
        AFixed = (Button) findViewById(R.id.baFixed);
        ATotal = (Button) findViewById(R.id.baTotal);
        AVariable = (Button) findViewById(R.id.baVariable);
        RWages = (Button) findViewById(R.id.bRwages);
        
        tv1.setTextColor(Color.BLACK);
        
        // set on click listeners for each button object
        profit.setOnClickListener(this);
        PercentChange.setOnClickListener(this);
        unemployRate.setOnClickListener(this);
        GDP.setOnClickListener(this);
        PerCap.setOnClickListener(this);
        PerIncrease.setOnClickListener(this);
        Ereserves.setOnClickListener(this);
        IRates.setOnClickListener(this);
        AFixed.setOnClickListener(this);
        AVariable.setOnClickListener(this);
        ATotal.setOnClickListener(this);
        RWages.setOnClickListener(this);      
        
   
        
    }
    
    @Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
	}

	public void Profit()
    {
    	cost = Float.parseFloat(edit1.getText().toString());
    	revenue = Float.parseFloat(edit2.getText().toString());
    	ProfitTotal = cost - revenue;
    	tv1.setText("Profit is: "+ Float.toString(ProfitTotal));
    }
    public void PercentageChange()
    {
    	// Percentage change = Current price - Original Price / Original Price
    	CurrentPrice = Float.parseFloat(edit1.getText().toString());
    	OriginalPrice = Float.parseFloat(edit2.getText().toString());
    	PercentChangeTotal = (CurrentPrice - OriginalPrice) / OriginalPrice;
    	tv1.setText("Percent Change is:" +Float.toString(PercentChangeTotal));  	
    }
    public void UnemploymentRate()
    {
    	// Unemployment Rate = Number of unemployed / Total Labor force
    	TotalUnemployed= Float.parseFloat(edit1.getText().toString());
    	laborForce = Float.parseFloat(edit2.getText().toString());
    	TotalUnemploymentRate = TotalUnemployed / laborForce;
    	tv1.setText("Unemployment Rate is: "+ Float.toString(TotalUnemploymentRate)); 	
    }
   public void GDP()
   {
	   // Real GDP = Nominal GDP / GDP deflator * 100
	NominalGDP= Float.parseFloat(edit1.getText().toString());
   	GDPDeflator = Float.parseFloat(edit2.getText().toString());
   	RealGDP = NominalGDP / GDPDeflator * 100;
   	tv1.setText("Gross Domestic Product is: "+ Float.toString(RealGDP));   
   }
   public void PerCapia()
   {
	   //Per Capita GDP = GDP / Population 
	Gdp= Float.parseFloat(edit1.getText().toString());
   	Population = Float.parseFloat(edit2.getText().toString());
   	PerCapGDP = Gdp / Population;
   	tv1.setText("Per Capia GDP is: "+ Float.toString(PerCapGDP));
	   
   }
   public void PercentIncreaseCPI()
   {
	   // Percent increase in CPI = (CPI in current year - CPI in previous year)/ CPI in previous year * 100
	CPIcurrentYear= Float.parseFloat(edit1.getText().toString());
   	CPIpreviousYear= Float.parseFloat(edit2.getText().toString());
   	PercentIncrCPI = (CPIcurrentYear - CPIpreviousYear) / CPIpreviousYear * 100;
   	tv1.setText("Percent Increase in CPI is: "+ Float.toString(PercentIncrCPI));
	   
   }
  
   public void ExcessReserves()
   {
	   // Excess reserves = actual reserves - required reserves
	ActualReserves= Float.parseFloat(edit1.getText().toString());
   	RequiredReserves = Float.parseFloat(edit2.getText().toString());
   	ExcReserves = ActualReserves - RequiredReserves;
   	tv1.setText("Excess Reserve is: "+ Float.toString(ExcReserves));
	   
   }
   public void InterestRate()
   {
	   // Interest Rate = Interest Paid / Price of bond
	IntPaid= Float.parseFloat(edit1.getText().toString());
   	PriceBond = Float.parseFloat(edit2.getText().toString());
   	IntRate = IntPaid / PriceBond;
   	tv1.setText("Interest Rate is: "+ Float.toString(IntRate));
   }
   public void AverageFixedCost()
   {
	   // Average fixed cost = fixed cost / output
	FixedCost= Float.parseFloat(edit1.getText().toString());
   	Output = Float.parseFloat(edit2.getText().toString());
   	AFC = FixedCost / Output;
   	tv1.setText("Average Fixed Cost is: "+ Float.toString(AFC));
   }
   public void AverageVariableCost()
   {
	   // Average variable cost = variable cost / output
	    VariableCost= Float.parseFloat(edit1.getText().toString());
	   	Output = Float.parseFloat(edit2.getText().toString());
	   	AVC = VariableCost / Output;
	   	tv1.setText("Average Variable Cost is: "+ Float.toString(AVC));
	   
   }
   public void AverageTotalCost()
   {
	   // Average total cost = total cost / output
	    TotalCost= Float.parseFloat(edit1.getText().toString());
	   	Output = Float.parseFloat(edit2.getText().toString());
	   	ATC = FixedCost / Output;
	   	tv1.setText("Average Total Cost is: "+ Float.toString(ATC));
	   
   }
   public void RealWages()
   {
	   // Real wages = money wages(current year)/ CPI(Current year) * 100
	    MoneyWages= Float.parseFloat(edit1.getText().toString());
	   	CPIcurrentYear = Float.parseFloat(edit2.getText().toString());
	   	RealWages = (MoneyWages  / CPIcurrentYear)*100;
	   	tv1.setText("Real Wage is: "+ Float.toString(RealWages));
   }
   


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_business_calculator, menu);
        return true;
    }

public void onClick(View v) {
		
		switch(v.getId())
		{
		
		case R.id.bPercent:
			PercentageChange();
			break;
		case R.id.bprofit:
		    Profit();
		    break;
		case R.id.bunemploy:
			UnemploymentRate();
			break;
		case R.id.bgdp:
			GDP();
			break;
		case R.id.bpercapia:
			PerCapia();
			break;
		case R.id.bpercentincrease:
			PercentIncreaseCPI();
			break;
		case R.id.bEreserves:
			ExcessReserves();
			break;
		case R.id.bIRates:
			InterestRate();
			break;
		case R.id.baFixed:
			AverageFixedCost();
			break;
		case R.id.baVariable:
			AverageVariableCost();
			break;
		case R.id.baTotal:
			AverageTotalCost();
			break;
		case R.id.bRwages:
			RealWages();
			break;		
		
		}
		
	}
}
