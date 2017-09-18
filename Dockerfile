#FROM registry.paas.redhat.com/itpaas-blessed-images/rhel7-platops-eap64:latest

COPY confd /etc/confd
COPY start.sh /start.sh

#RUN curl -ko $JBOSS_HOME/standalone/deployments/KoaLAScheduler_web.war \
#    https://sit-jenkins-rhel73.web.dev.ext.devlab.redhat.com/sit-repo/InfoPro/KoaLAScheduler_web.war

# Run commands as root
#USER 0
#RUN chmod +x /start.sh && chown 251:0 /start.sh
#USER 251
# End run commands as root

CMD /start.sh
