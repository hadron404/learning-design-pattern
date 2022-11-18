package org.example.usecase;

import org.example.state.context.MovieStateContext;

public class Rental {
	private final MovieStateContext _movie;
	/**
	 * 租期
	 */
	private final int _daysRented;

	public Rental(MovieStateContext movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public MovieStateContext getMovie() {
		return _movie;
	}

	double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	public int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
