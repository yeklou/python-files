import turtle

'''
# This program repeats the squares 100 times
'''

# Name constants
STARTING_X = 100
STARTING_Y = -100
STARTING_SIDE = 8
ANIMATION_SPEED = 10
NUM_SQUARES = 100
ANGLE = 90
NUM_SIDE = 4

# Name variables
side = STARTING_SIDE 

#Start program
# Make the entire square one color
for n in range(NUM_SQUARES):
   for s in range(NUM_SIDE):
      if( s % 2) > 0:
         turtle.color('red')
      else:
         turtle.color('blue')
   #FIRST SQUARE
   #Set up turtle
   turtle.speed(ANIMATION_SPEED)
   turtle.hideturtle()
   
   # Set up the initial x and y coordonates  
   turtle.penup()  
   turtle.goto(STARTING_X, STARTING_Y)
   turtle.pendown()
   
   #draw first square
   turtle.pensize(1)
   turtle.left(ANGLE)
   turtle.forward(side)
   turtle.left(ANGLE)
   turtle.forward(side)
   turtle.left(ANGLE)
   turtle.forward(side)
   turtle.left(ANGLE)
   turtle.forward(side)   
   
   # Set up turtle for the next square
   
   #Get the next square side
   side = side + 2
   x = turtle.xcor()
   y = turtle.ycor()
 
   # Position the turtle for the next square
   turtle.penup()
   turtle.goto(x, y)
   turtle.pendown

         
 
   
   
  
           
   
   
      


                  
                  
                  