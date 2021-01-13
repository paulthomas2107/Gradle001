package com.pault.demo;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;

public class HelloPaul {

    final static Logger logger = Logger.getLogger(HelloPaul.class);

    public static void main(String [] args) {


        logger.info("Started.....");

        Email myMail = new HtmlEmail();
        myMail.setHostName("mail.somewhere.co.uk");

        logger.info("Ended.....");




    }
}
