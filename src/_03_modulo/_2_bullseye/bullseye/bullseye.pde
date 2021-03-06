
void setup() {

  // set the size of your sketch
  size(500, 500);
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 10; i > 0; i--) {
    if (i % 2 == 0) {
      fill(#FF0303);
    } else {
      fill(0);
    }
    ellipse(250, 250, i * 20, i * 20);
  }
  //Use an if statement and modulo to alternate the color of your rings.
}
