/* this file is generated by RelaxNGCC */
import java.math.BigInteger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import relaxngcc.runtime.NGCCPlainHandler;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;

class sample1 extends NGCCPlainHandler {
public static final String DEFAULT_NSURI = "";
private int _ngcc_current_state;
private String name;
private String number;
public sample1(XMLReader reader, NGCCPlainHandler parent) {
	super(reader, parent);
}
protected void initState() { _ngcc_current_state=9; 
}
public static XMLReader getPreparedReader(SAXParserFactory f) throws ParserConfigurationException, SAXException {
	XMLReader r = f.newSAXParser().getXMLReader();
	r.setContentHandler(new sample1(r, null));
	return r;
}
public static void main(String[] args) throws Exception {
	if(args.length!=1) { System.err.println("usage: sample1 <instancefile>"); return; }
	SAXParserFactory f = SAXParserFactory.newInstance();
	f.setNamespaceAware(true);
	XMLReader r = getPreparedReader(f);
	r.parse(args[0]);
}
public boolean accepted() {
return _ngcc_current_state==0;
}

/* ------------ enterElement ------------ */
public void enterElement(String uri,String localname,String qname) throws SAXException
{
if(_ngcc_current_state==1) {
if(localname.equals("player") && uri.equals(DEFAULT_NSURI)) {
_ngcc_current_state=7;
processAttribute();

}
else this.throwUnexpectedElementException(qname);
}

else if(_ngcc_current_state==5) {
if(localname.equals("name") && uri.equals(DEFAULT_NSURI)) {
_ngcc_current_state=4;

}
else this.throwUnexpectedElementException(qname);
}

else if(_ngcc_current_state==8) {
if(localname.equals("player") && uri.equals(DEFAULT_NSURI)) {
_ngcc_current_state=7;
processAttribute();

}
else this.throwUnexpectedElementException(qname);
}

else if(_ngcc_current_state==9) {
if(localname.equals("team") && uri.equals(DEFAULT_NSURI)) {
_ngcc_current_state=8;

}
else this.throwUnexpectedElementException(qname);
}

else this.throwUnexpectedElementException(qname);
}

/* ------------ leaveElement ------------ */
public void leaveElement(String uri,String localname,String qname) throws SAXException
{
if(_ngcc_current_state==1) {
if(localname.equals("team") && uri.equals(DEFAULT_NSURI)) {
_ngcc_current_state=0;

}
else this.throwUnexpectedElementException(qname);
}

else if(_ngcc_current_state==2) {
if(localname.equals("player") && uri.equals(DEFAULT_NSURI)) {
_ngcc_current_state=1;

}
else this.throwUnexpectedElementException(qname);
}

else if(_ngcc_current_state==3) {
if(localname.equals("name") && uri.equals(DEFAULT_NSURI)) {
_ngcc_current_state=2;

}
else this.throwUnexpectedElementException(qname);
}

else this.throwUnexpectedElementException(qname);
}

/* ------------ text ------------ */
public void text(String value) throws SAXException
{
if(_ngcc_current_state==4) {
{
name=value;System.out.println(name);
_ngcc_current_state=3;

}
}

else if(_ngcc_current_state==6) {
{
number=value;System.out.println(number);
_ngcc_current_state=5;

}
}

}

/* ------------ attribute ------------ */
public void processAttribute() throws SAXException
{
int __attr_index;
if(_ngcc_current_state==7) {
__attr_index = getAttributeIndex(DEFAULT_NSURI, "number");

if(__attr_index>=0) {
_ngcc_current_state=6;
consumeAttribute(__attr_index);

}
}

}

}
