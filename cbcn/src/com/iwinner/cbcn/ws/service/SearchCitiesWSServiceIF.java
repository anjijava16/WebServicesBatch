package com.iwinner.cbcn.ws.service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.bind.annotation.XmlElement;

import com.iwinner.cbcn.ws.exceptions.WebServiceException;
import com.iwinner.cbcn.ws.form.ResponseForm;

/**
 * 
 * It is RedemptionWSServiceIF interface it is service provider interface
 * @author valuelabs
 * @version 1.0
 * @since 16th Feb,2016
 * 
 *
 */
@WebService(name="SearchCitiesWSServiceIF")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL,parameterStyle=ParameterStyle.WRAPPED)
public interface SearchCitiesWSServiceIF {
	
	
	/**
	 * It is redemptionProcessingService it is checking redemptionProcessingService
	 * @param msisdn
	 * @param promoCode
	 * @param keyCode
	 * @param shortCode
	 * @return
	 * @throws WebServiceException
	 */
	
	@WebMethod(operationName="searchCitiesService")
	@WebResult(name = "searchCitiesNames")
	public ResponseForm	 searchCitiesNames(

			@WebParam(name="countryName",mode=Mode.IN)@XmlElement(required=true,nillable=false) String countryName)	throws WebServiceException;
	
}
