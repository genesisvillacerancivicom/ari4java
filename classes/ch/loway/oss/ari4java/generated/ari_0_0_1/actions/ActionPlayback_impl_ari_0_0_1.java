package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

public class ActionPlayback_impl_ari_0_0_1 extends BaseAriAction  implements ActionPlayback {
/**********************************************************
 * Control object for a playback operation.
 * 
 * Get a playback's details.
 *********************************************************/
public Playback getPlayback(String playbackId) throws RestException {
String url = "/playback/" + playbackId + "";
List<BaseAriAction.HttpParam> lParamQuery = new ArrayList<BaseAriAction.HttpParam>();
List<BaseAriAction.HttpParam> lParamForm = new ArrayList<BaseAriAction.HttpParam>();
List<BaseAriAction.HttpResponse> lE = new ArrayList<BaseAriAction.HttpResponse>();
String json = httpAction( url, "GET", lParamQuery, lParamForm, lE);
return (Playback) deserializeJson( json, Playback_impl_ari_0_0_1.class ); 
}

/**********************************************************
 * Control object for a playback operation.
 * 
 * Stop a playback.
 *********************************************************/
public void stopPlayback(String playbackId) throws RestException {
String url = "/playback/" + playbackId + "";
List<BaseAriAction.HttpParam> lParamQuery = new ArrayList<BaseAriAction.HttpParam>();
List<BaseAriAction.HttpParam> lParamForm = new ArrayList<BaseAriAction.HttpParam>();
List<BaseAriAction.HttpResponse> lE = new ArrayList<BaseAriAction.HttpResponse>();
String json = httpAction( url, "DELETE", lParamQuery, lParamForm, lE);
}

/**********************************************************
 * Control object for a playback operation.
 * 
 * Get a playback's details.
 *********************************************************/
public void controlPlayback(String playbackId, String operation) throws RestException {
String url = "/playback/" + playbackId + "/control";
List<BaseAriAction.HttpParam> lParamQuery = new ArrayList<BaseAriAction.HttpParam>();
List<BaseAriAction.HttpParam> lParamForm = new ArrayList<BaseAriAction.HttpParam>();
List<BaseAriAction.HttpResponse> lE = new ArrayList<BaseAriAction.HttpResponse>();
lParamQuery.add( BaseAriAction.HttpParam.build( "operation", operation) );
lE.add( BaseAriAction.HttpResponse.build( 400, "The provided operation parameter was invalid") );
lE.add( BaseAriAction.HttpResponse.build( 404, "The playback cannot be found") );
lE.add( BaseAriAction.HttpResponse.build( 409, "The operation cannot be performed in the playback's current state") );
String json = httpAction( url, "POST", lParamQuery, lParamForm, lE);
}

};
