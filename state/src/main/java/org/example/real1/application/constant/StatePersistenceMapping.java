package org.example.real1.application.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.real1.application.domain.Order;
import org.example.real1.application.state.State;
import org.example.real1.application.state.concrete.*;

@Getter
@AllArgsConstructor
public enum StatePersistenceMapping implements EnumConverter {


	FINANCIAL_HANDLING(new Order.OrderState(4), new FinancialHandlingState()),
	FINISHED(new Order.OrderState(3), new FinishedState()),
	WAITING_FINISH(new Order.OrderState(2), new WaitingFinishState()),
	HANDLING(new Order.OrderState(1), new HandlingState()),
	WAITING_PICK(new Order.OrderState(0), new WaitingPickState()),
	CREATED(new Order.OrderState(-1), new CreatedState()),
	;
	private final Order.OrderState code;
	private final State state;


}
