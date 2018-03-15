final int NROWS = 8;
final int NCOLUMNS = 8;

void setup() {
  size(800, 800);
}

void draw() {
  int thing = 255;
  int thing2 = width/NROWS;
  int thing3 = height/NCOLUMNS;
  for (int i = 0; i < NROWS; i++) {
    for (int j = 0; j < NCOLUMNS; j++) {
      fill(thing);
      rect(i*thing2, j*thing3, thing2, thing3);
      if (thing == 255) {
        thing = 0;
      } else {
        thing = 255;
      }
    }
    if (thing == 255) {
      thing = 0;
    } else {
      thing = 255;
    }
  }
}