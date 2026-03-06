<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculater</title>
</head>
<body>
    <form action="calc" method="post">
        First No.
        <input type="Number" name="val1"><br><br>
        Second No.
        <input type="Number" name="val2"><br><br>

        Oprator
        <select name="op">
             <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
            <option value="%">%</option>
        </select><br><br>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>