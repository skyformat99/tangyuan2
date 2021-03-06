package org.xson.tangyuan.xml;

import org.xson.tangyuan.TangYuanException;

public class XmlParseException extends TangYuanException {

	private static final long	serialVersionUID	= 4392802726857711341L;

	public XmlParseException() {
		super();
	}

	public XmlParseException(String message) {
		super(message);
	}

	public XmlParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public XmlParseException(Throwable cause) {
		super(cause);
	}
}
