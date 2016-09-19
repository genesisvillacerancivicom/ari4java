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
 * Channel changed Connected Line.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelConnectedLine_impl_ari_1_6_0 extends Event_impl_ari_1_6_0 implements ChannelConnectedLine, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel whose connected line has changed.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_6_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

