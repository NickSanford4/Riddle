void setup() {
  size(1850, 850);
}
int pipeX = 2000;
int x =100;
int y =300;
double gravity = .3;
double birdYVelocity = 5;
int pipeY = (int) random(100, 400);
void draw() {
  pipeX = pipeX - 10;
  background(90, 215, 215);
  fill(255, 0, 0);
  ellipse(x, y, 40, 40);
  fill(30, 170, 50);
  rect(pipeX, pipeY, 50, 600);
  
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


}
boolean intersects(int birdX, int birdY, int pipeX, int pipeY, int pipeWidth, int pipeHeight) {
if (birdY > pipeY && birdX > pipeX && birdX < pipeX + pipeWidth && birdY < pipeY + pipeHeight)
return true;
else 
return false;
}