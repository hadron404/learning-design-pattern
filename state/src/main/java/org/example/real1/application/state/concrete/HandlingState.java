package org.example.real1.application.state.concrete;

import org.example.real1.application.constant.Action;
import org.example.real1.application.constant.StatePersistenceMapping;
import org.example.real1.application.domain.Order;
import org.example.real1.application.state.Context;
import org.example.real1.application.state.State;

import java.util.Optional;

public class HandlingState implements State {

	public HandlingState() {
	}

	@Override
	public StatePersistenceMapping next(Order order) {
		if (order.isReturnCashOrder()) {
			return StatePersistenceMapping.FINANCIAL_HANDLING;
		}
		return StatePersistenceMapping.WAITING_FINISH;
	}

	@Override
	public StatePersistenceMapping prev(Order order) {
		return StatePersistenceMapping.WAITING_PICK;
	}

	@Override
	public Optional<Action> create(Context context) {
		return Optional.empty();
	}

	@Override
	public Optional<Action> pick(Context context) {
		return Optional.empty();
	}

	@Override
	public Optional<Action> submit(Context context) {
		System.out.println("the order is handling");
		// 	 客服补充工单一些信息
		return Optional.of(Action.SUBMIT);
	}

	@Override
	public Optional<Action> submitByFinancial(Context context) {
		return Optional.empty();
	}

	@Override
	public Optional<Action> rejectByFinancial(Context context) {
		return Optional.empty();
	}

	@Override
	public Optional<Action> complete(Context context) {
		return Optional.empty();
	}

	@Override
	public Optional<Action> drop(Context context) {
		return Optional.empty();
	}
}
