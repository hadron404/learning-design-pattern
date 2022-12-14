package org.example.chains;

import org.example.TaskCommand;

import java.util.Optional;

public class FooTaskChain extends AbstractTaskChain {
	@Override
	public Optional<String> execute(TaskCommand command) {
		return Optional.of("foo");
	}
}
