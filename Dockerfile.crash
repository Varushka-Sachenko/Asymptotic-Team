FROM node:14

# Create and set the working directory inside the container
WORKDIR /usr/src/app

# Copy package.json and package-lock.json from your local filesystem to the container
COPY package*.json ./

# Install npm dependencies
RUN npm install

# Copy the rest of the application files from your local filesystem to the container
COPY public public
COPY src src

# Expose the port that the application will run on
EXPOSE 3000

# Define the command to run your application using nodemon (assumes nodemon is a development dependency)
CMD ["npm", "start"]
