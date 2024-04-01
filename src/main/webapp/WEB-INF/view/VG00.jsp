<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>Login Form</title>
  </head>
  <body>
    <h2>Login</h2>

    <form
      action="/simple/app/VG00/login"
      method="post"
      modelAttribute="VG00Form"
    >
      <div>
        <label for="userid">Userid:</label>
        <input type="text" id="userid" name="userid" required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required />
      </div>
      <button type="submit">Login</button>
    </form>
  </body>
</html>
