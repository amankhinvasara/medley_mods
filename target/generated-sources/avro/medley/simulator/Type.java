/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package medley.simulator;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum Type {
  PING, JOIN, JOIN_ACK, ACK, IND_PING, IND_PING_ACK, TERMINATE, CRASH, UNLUCKY, REPORT_ALIVE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Type\",\"namespace\":\"medley.simulator\",\"symbols\":[\"PING\",\"JOIN\",\"JOIN_ACK\",\"ACK\",\"IND_PING\",\"IND_PING_ACK\",\"TERMINATE\",\"CRASH\",\"UNLUCKY\",\"REPORT_ALIVE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}