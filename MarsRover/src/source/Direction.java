package source;

import source.Position;

public enum Direction {
	
	N{
		@Override
		public Direction turnRight(){
			return Direction.E;
		}
		@Override
		public Direction turnLeft(){
			return Direction.W;
		}
	},
	S{
		@Override
		public Direction turnRight(){
			return Direction.W;
		}
		@Override
		public Direction turnLeft(){
			return Direction.E;
		}
	},
	E{
		@Override
		public Direction turnRight(){
			return Direction.S;
		}
		@Override
		public Direction turnLeft(){
			return Direction.N;
		}
	},
	W{
		@Override
		public Direction turnRight(){
			return Direction.N;
		}
		@Override
		public Direction turnLeft(){
			return Direction.S;
		}
	};
	public abstract Direction turnRight();
	public abstract Direction turnLeft();

}
