final int BRICK_WIDTH = 30;
final int BRICK_HEIGHT = 30;
final int BRICKS_IN_BASE = 15;

void setup() {
  size(750, 500);
}

void draw() {
  fill(255);
  
  int center = width/2;
  
  for (int i = BRICKS_IN_BASE; i > 0; i--) {
    int side = (i * BRICK_WIDTH) / 2;
    int begin = center - side;
    int tall = BRICKS_IN_BASE - i;
    for (int j = 0; j < i; j++) {
      rect(begin + (j*BRICK_WIDTH), (height-BRICK_HEIGHT)-(tall*BRICK_HEIGHT), BRICK_WIDTH, BRICK_HEIGHT);
    }
  }
}