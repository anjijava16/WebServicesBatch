package com.iwinner.cbcn.ws.service;

import java.util.Date;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.iwinner.cbcn.service.SearchCitiesServiceImpl;
import com.iwinner.cbcn.utils.DateUtils;
import com.iwinner.cbcn.utils.TACGenerator;
import com.iwinner.cbcn.ws.exceptions.WebServiceException;
import com.iwinner.cbcn.ws.form.ResponseForm;


/**
 * 
 * 
 * 
 * @author anjaiahspr
 *
 */
@WebService(targetNamespace = "http://service.ws.cbcn.iwinner.com/", endpointInterface = "com.iwinner.cbcn.ws.service.SearchCitiesWSServiceIF", portName = "RedemptionWSServiceImplPort", serviceName = "RedemptionWSServiceImpl")
@InInterceptors(interceptors = "com.iwinner.cbcn.utils.BasicAuthAuthorizationInterceptor")
public class SearchCitiesWSServiceImpl implements SearchCitiesWSServiceIF {

	
	private static Logger LOGGER=Logger.getLogger("LOGGER");
	
	private static final Logger REQRES_EDRS_LOGGER = Logger.getLogger("REQRES_EDR");
	
	
	
	
	
	private  SearchCitiesServiceImpl searchCitiesService=null;
	
		
	public SearchCitiesServiceImpl getSearchCitiesService() {
		return searchCitiesService;
	}
	
	@Autowired
	public void setSearchCitiesService(SearchCitiesServiceImpl searchCitiesService) {
		this.searchCitiesService = searchCitiesService;
	}
	
	
	
	public SearchCitiesWSServiceImpl() {
		super();		
	}
	

	public ResponseForm searchCitiesNames(String countryName)
			throws WebServiceException {
		LOGGER.info("##### Enter into the searchCitiesNames start at the "+ new Date());
		
		String trasRefId=TACGenerator.generateOTP(8);
		
		REQRES_EDRS_LOGGER.info("CBCN_REQ"+"|"+trasRefId+"|"+DateUtils.getCurrentDateTimestamp()+"|"+countryName);
		
		
		
		
		
		REQRES_EDRS_LOGGER.info("CBCN_RES"+"|"+trasRefId+"|"+DateUtils.getCurrentDateTimestamp()+"|"+countryName);
		LOGGER.info("##### Exit into the searchCitiesNames  end at the "+ new Date());
		return null;
	}

	
	
	//private  String trasRefId=null;

	/**
	 * It is redemptionProcessingService it is checking redemptionProcessingService
	 * @param msisdn
	 * @param promoCode
	 * @param keyCode
	 * @param shortCode
	 * @return
	 * @throws WebServiceException
	 */
	/*public RedemptionResponseForm redemptionProcessingService(String msisdn,String promoCode, String keyCode, String shortCode)
			throws WebServiceException {
	
		LOGGER.info("### Enter into the redemptionProcessingService() promoCode="+promoCode);
		
			
		String trasRefId=TACGenerator.generateOTP(8);
		
		//public static String getHtResLogger(String prefix,String trasRefId,String msisdn,String htMsgCode,String htMsgDesc,String delim){

		MPCS_STATS_EDR.info(WriterEDRLogger.getMPCSReqLogger("MPCS_REQ", trasRefId, msisdn, keyCode, shortCode, "|"));

		//String trasRefId,String msisdn,String promoCode,String keyCode,String shortCode
		
		MPCS_WS_LOGGER.info(WriterEDRLogger.redeemptionServiceRequest(trasRefId,msisdn,promoCode,keyCode,shortCode));
		
		RedemptionResponseForm redemptionResponse = new RedemptionResponseForm();
		
		
		if (msisdn.trim() != null && promoCode != null && keyCode != null
				&& shortCode != null && !StringUtils.isEmpty(msisdn)
				&& !StringUtils.isEmpty(promoCode)&& !StringUtils.isEmpty(keyCode)
				&& !StringUtils.isEmpty(shortCode)) {
		try {
		
			if(StringUtils.isNumeric(shortCode)){
					//redemptionResponse=redemService.executeRedeemPromoCode(promoCode,msisdn,keyCode,shortCode,trasRefId);
			}else{
				redemptionResponse.setStatusCode(58);
				redemptionResponse.setStatusMessage("Error:ShortCode must be numeric only");
				redemptionResponse.setLangId("-1");
			}
		} catch (ServiceException e) {
			redemptionResponse.setStatusCode(57);
			redemptionResponse.setStatusMessage("ERROR: Internal Error");
			redemptionResponse.setLangId("-1");
		
		}catch(Exception e){
			redemptionResponse.setStatusCode(57);
			redemptionResponse.setStatusMessage("ERROR: Internal Error");
			redemptionResponse.setLangId("-1");
		   e.printStackTrace();
		}
		}else{
			redemptionResponse.setStatusCode(56);
			redemptionResponse.setStatusMessage("ERROR: Input parms promoCode,Msisdn,keyCode and shortCode mandatory");
			redemptionResponse.setLangId("-1");
		}
		MPCS_STATS_EDR.info(WriterEDRLogger.getMPCSResLogger("MPCS_RES", trasRefId, msisdn,redemptionResponse.getStatusCode().toString(), redemptionResponse.getStatusMessage(), redemptionResponse.getLangId(), "|"));
		
		LOGGER.info("### Exit into the redemptionProcessingService() ");

		MPCS_WS_LOGGER.info(WriterEDRLogger.redeemptionServiceResponse(msisdn, redemptionResponse.getLangId(), redemptionResponse.getStatusCode().toString(), redemptionResponse.getStatusMessage()));
		
		return redemptionResponse;
	 }*/

	public static void main(String[] args) {
			
		System.out.println(TACGenerator.generateOTP(8));
		/*String shortCode="270000";
		System.out.println(StringUtils.isNumeric(shortCode));*/
	}
	}
