package co.edu.udea.romanconverter.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/number")

public class ConvertParameter implements IConvertParameter{
	
	@Path(value = "/{intNumber}")
	
	@Produces(value = { MediaType.APPLICATION_JSON })
	@GET
	@Override
	public String ConverterParameter(@PathParam(value = "intNumber")int numeros){
		
		ConverterWeb converter = new ConverterWeb();
		String str= "";
		
		str = str + converter.toRoman(numeros);
		
		return str;
	}
}
