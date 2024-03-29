package org.example.real1.application.state;

import org.example.real1.application.constant.Action;
import org.example.real1.application.constant.StatePersistenceMapping;
import org.example.real1.application.domain.Order;

import java.util.Optional;

public interface State {

	StatePersistenceMapping next(Order order);

	StatePersistenceMapping prev(Order order);

	Optional<Action> create(Context context);

	Optional<Action> pick(Context context);

	Optional<Action> submit(Context context);

	Optional<Action> submitByFinancial(Context context);

	Optional<Action> rejectByFinancial(Context context);

	Optional<Action> complete(Context context);

	Optional<Action> drop(Context context);
}
