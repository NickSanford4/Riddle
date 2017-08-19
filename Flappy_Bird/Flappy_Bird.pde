void setup() {
  size(1850, 850);
}
int pipeX = 2000;
int x =100;
int y =300;
double gravity = .3;
double birdYVelocity = 5;
int pipeY = (int) random(100, 400);
int score = 0;
void draw() {
  if (x+3 >= pipeX&&x-3<=pipeX){
  score = score +1;
  }
  pipeX = pipeX - 10;
  background(90, 215, 215);
  fill(255, 0, 0);
  ellipse(x, y, 5, 5);
  fill(30, 170, 50);
  rect(pipeX, pipeY, 50, 600);
  rect(0,0,1000000,10  );
  rect(0,840,1000000,10  );
  y=y+=birdYVelocity;
  birdYVelocity = birdYVelocity+gravity;
  if (mousePressed) {
    birdYVelocity= birdYVelocity-1;
  }
  if (pipeX < -100){
  pipeX = 2000;
  pipeY = (int) random(-100, 400);
  }
  if (intersects(x,y,pipeX,pipeY, 50, 600)){
  exit();
  }
if (intersects(x,y,0,0,1000000, 10) ){
  exit();
}
if (intersects(x,y,0,950,1000000, 10) ){
  exit();
}
fill(0,0,0);
text(score, 860,100 );

}
boolean intersects(int birdX, int birdY, int pipeX, int pipeY, int pipeWidth, int pipeHeight) {
if (birdY > pipeY && birdX > pipeX && birdX < pipeX + pipeWidth && birdY < pipeY + pipeHeight)
return true;
else 
return false;
}
