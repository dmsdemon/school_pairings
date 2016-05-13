package ian.home.school_pairings.tournament;

import ian.home.school_pairings.Player;

public class Withdrawn {
		private Player player;
		private int roundWithdrawn;
		private boolean markResultsSoFarAsLosses;
		private boolean markRemainingResultsAsLosses;

		public Withdrawn(Player player, int roundWithdrawn, boolean markResultsSoFarAsLosses,
				boolean markRemainingResultsAsLosses) {
			super();
			this.player = player;
			this.roundWithdrawn = roundWithdrawn;
			this.markResultsSoFarAsLosses = markResultsSoFarAsLosses;
			this.markRemainingResultsAsLosses = markRemainingResultsAsLosses;
		}

		public Player getPlayer() {
			return player;
		}

		public int getRoundWithdrawn() {
			return roundWithdrawn;
		}

		public boolean isMarkResultsSoFarAsLosses() {
			return markResultsSoFarAsLosses;
		}

		public boolean isMarkRemainingResultsAsLosses() {
			return markRemainingResultsAsLosses;
		}



}
