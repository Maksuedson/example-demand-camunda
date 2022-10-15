package com.ntconsult.bpm.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class NotificarReprovacao implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("********* Email enviado para notificação !!!!!! *********");
	}

}
