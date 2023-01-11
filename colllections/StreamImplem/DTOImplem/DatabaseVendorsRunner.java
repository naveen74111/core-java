package com.xworkz.colllections.StreamImplem.DTOImplem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.colllections.StreamImplem.DTO.DataBaseVendorDto;
import com.xworkz.colllections.StreamImplem.DTO.Type;

public class DatabaseVendorsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBaseVendorDto database1 = new DataBaseVendorDto("Amazon web services","Amazon",Type.Relatinal,100.0);
		DataBaseVendorDto database2 = new DataBaseVendorDto("microsoft Azurs","mycrosoft",Type.RNH,150.0);
		DataBaseVendorDto database3 = new DataBaseVendorDto("Amazon web services","Amazon",Type.Relatinal,170.0);
		DataBaseVendorDto database4 = new DataBaseVendorDto("Amazon web services","Amazon",Type.Relatinal,100.0);
		DataBaseVendorDto database5 = new DataBaseVendorDto("Amazon web services","Amazon",Type.Relatinal,200.0);
		
		Collection<DataBaseVendorDto> data = new ArrayList<DataBaseVendorDto>();
		data.add(database1);
		data.add(database2);
		data.add(database3);
		data.add(database4);
		data.add(database5);
		
		data.stream().map(e->e.getDevelopedBy().toUpperCase())
		.collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		data.stream().filter(e->e.getLicenseCost()<200 && e.getType().equals(Type.Relatinal)).collect(Collectors.toList()).forEach(e->System.out.println(e));

		System.out.println(System.lineSeparator());
		data.stream().map(e->e.getType()).collect(Collectors.toList()).forEach(e->System.out.println(e));
	}

}
