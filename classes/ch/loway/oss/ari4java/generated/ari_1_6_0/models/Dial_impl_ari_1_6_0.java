package ch.loway.oss.ari4java.generated.ari_1_6_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 31 18:05:10 CEST 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Dialing state has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class Dial_impl_ari_1_6_0 extends Event_impl_ari_1_6_0 implements Dial, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The calling channel.  */
  private Channel caller;
 public Channel getCaller() {
   return caller;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_6_0.class )
 public void setCaller(Channel val ) {
   caller = val;
 }

  /**  Current status of the dialing attempt to the peer.  */
  private String dialstatus;
 public String getDialstatus() {
   return dialstatus;
 }

 @JsonDeserialize( as=String.class )
 public void setDialstatus(String val ) {
   dialstatus = val;
 }

  /**  The dial string for calling the peer channel.  */
  private String dialstring;
 public String getDialstring() {
   return dialstring;
 }

 @JsonDeserialize( as=String.class )
 public void setDialstring(String val ) {
   dialstring = val;
 }

  /**  Forwarding target requested by the original dialed channel.  */
  private String forward;
 public String getForward() {
   return forward;
 }

 @JsonDeserialize( as=String.class )
 public void setForward(String val ) {
   forward = val;
 }

  /**  Channel that the caller has been forwarded to.  */
  private Channel forwarded;
 public Channel getForwarded() {
   return forwarded;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_6_0.class )
 public void setForwarded(Channel val ) {
   forwarded = val;
 }

  /**  The dialed channel.  */
  private Channel peer;
 public Channel getPeer() {
   return peer;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_6_0.class )
 public void setPeer(Channel val ) {
   peer = val;
 }

/** No missing signatures from interface */
}

