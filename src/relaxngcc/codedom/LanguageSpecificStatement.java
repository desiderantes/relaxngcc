package relaxngcc.codedom;

import java.io.IOException;
import java.io.Writer;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class LanguageSpecificStatement extends Statement {

	private LanguageSpecificString _Content;
	
	public LanguageSpecificStatement(LanguageSpecificString content) {
		_Content = content;
	}

    public void writeTo(OutputParameter param, Writer writer) throws IOException {
    	writeIndent(param, writer);
    	_Content.writeTo(param, writer);
    	writer.write(";");
    	writer.write(NEWLINE);
    }

}