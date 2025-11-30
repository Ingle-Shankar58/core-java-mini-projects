<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Employee Management System — README</title>
  <style>
    :root{--bg:#0f1724;--card:#0b1220;--muted:#94a3b8;--accent:#06b6d4;--accent-2:#7c3aed;color-scheme:dark}
    html,body{height:100%;margin:0;font-family:Inter,ui-sans-serif,system-ui,-apple-system,"Segoe UI",Roboto,'Helvetica Neue',Arial; background:linear-gradient(180deg,#071025 0%, #07182b 60%);color:#e6eef6}
    .container{max-width:980px;margin:40px auto;padding:28px;background:rgba(255,255,255,0.02);border-radius:14px;box-shadow:0 10px 30px rgba(2,6,23,0.6);}
    header{display:flex;align-items:center;gap:16px}
    .logo{width:64px;height:64px;border-radius:12px;background:linear-gradient(135deg,var(--accent),var(--accent-2));display:flex;align-items:center;justify-content:center;font-weight:700;color:#031127;font-size:22px}
    h1{margin:0;font-size:24px}
    p.lead{color:var(--muted);margin-top:6px}
    .badges{margin-left:auto;display:flex;gap:8px}
    .badge{background:rgba(255,255,255,0.03);padding:6px 10px;border-radius:999px;font-size:13px;color:var(--muted);border:1px solid rgba(255,255,255,0.03)}
    section{margin-top:20px}
    h2{font-size:16px;margin:0 0 10px 0}
    .grid{display:grid;grid-template-columns:1fr 1fr;gap:16px}
    pre{background:#031424;padding:12px;border-radius:8px;overflow:auto;border:1px solid rgba(255,255,255,0.03)}
    table{width:100%;border-collapse:collapse}
    th,td{padding:8px 10px;text-align:left;border-bottom:1px solid rgba(255,255,255,0.03);color:#cfe6ff}
    .muted{color:var(--muted)}
    .cta{display:inline-block;padding:10px 14px;border-radius:10px;background:linear-gradient(90deg,var(--accent),var(--accent-2));color:#02182b;text-decoration:none;font-weight:600}
    footer{margin-top:26px;color:var(--muted);font-size:13px}
    @media(max-width:760px){.grid{grid-template-columns:1fr}.badges{display:none}}
  </style>
</head>
<body>
  <div class="container">
    <header>
      <div class="logo">EMS</div>
      <div>
        <h1>Employee Management System — Java (Console)</h1>
        <p class="lead">A simple MVC-based console application to manage HR, Admin and SalesManager employees. CRUD operations are implemented using a DAO over a fixed in-memory array.</p>
      </div>
      <div class="badges">
        <div class="badge">Java</div>
        <div class="badge">OOP</div>
        <div class="badge">MVC</div>
      </div>
    </header>

    <section>
      <h2>📁 Project Structure</h2>
      <pre>
src/
├── Model/
│   ├── Employee.java
│   ├── HR.java
│   ├── Admin.java
│   └── SalseManager.java
├── Controller/
│   ├── EmployeeContrilar.java
│   └── EmployeeDAO.java
├── View/
│   └── EmployeeView.java
└── TestClass/
    └── TestApp.java
      </pre>
    </section>

    <section class="grid">
      <div>
        <h2>✨ Features</h2>
        <ul class="muted">
          <li>Add Employee (HR / Admin / SalesManager)</li>
          <li>Search Employee by ID</li>
          <li>Update Employee salary</li>
          <li>Delete Employee</li>
          <li>Display all Employees</li>
        </ul>

        <h2>🧠 Employee Types</h2>
        <table>
          <thead>
            <tr><th>Type</th><th>Extra Field</th><th>Salary Formula</th></tr>
          </thead>
          <tbody>
            <tr><td>HR</td><td>commission</td><td>salary + commission</td></tr>
            <tr><td>Admin</td><td>allowance</td><td>salary + allowance</td></tr>
            <tr><td>SalesManager</td><td>incentive</td><td>salary + incentive</td></tr>
          </tbody>
        </table>

      </div>

      <div>
        <h2>🚀 How to Run</h2>
        <pre>
# compile all classes
javac -d bin src/**/*.java

# run TestApp (from project root)
java -cp bin TestClass.TestApp
        </pre>

        <h2>🧪 Console Menu</h2>
        <pre>
1. Add Employee
2. Search Employee
3. Update Employee
4. Delete Employee
5. View All Employee
Enter Choice ==&gt;
        </pre>

        <h2>🛠 Notes & Tips</h2>
        <p class="muted">Currently the project uses a fixed-size array in <code>EmployeeDAO</code>. For production or larger datasets consider using <code>ArrayList</code> or a database (JDBC + MySQL).</p>

        <p><a class="cta" href="#">Copy to Repository</a></p>
      </div>
    </section>

    <section>
      <h2>🔧 Important Code Snippets</h2>

      <h3 class="muted">Delete Operation (fixed off-by-one)</h3>
      <pre>
public boolean deleteEmployee(int id) {
    for (int i = 0; i &lt; count; i++) {
        if (eArr[i].getId() == id) {
            for (int j = i; j &lt; count - 1; j++) {
                eArr[j] = eArr[j + 1];
            }
            eArr[--count] = null;
            return true;
        }
    }
    return false;
}
      </pre>

      <h3 class="muted">Sample Preloaded Data (in DAO static block)</h3>
      <pre>
eArr[0] = new HR(101, "Ranjit", 50000, 5000);
eArr[1] = new HR(102, "Amit", 48000, 4500);
...
      </pre>
    </section>

    <section>
      <h2>📈 Future Improvements</h2>
      <ul class="muted">
        <li>Replace fixed array with <code>ArrayList&lt;Employee&gt;</code> or DB</li>
        <li>Add authentication & role-based access</li>
        <li>Add file persistence or JDBC</li>
        <li>Build GUI using JavaFX / Swing</li>
        <li>Create unit tests (JUnit)</li>
      </ul>
    </section>

    <footer>
      <div>Made with ❤️ by <strong>Shankar Ingle</strong></div>
      <div style="margin-top:6px" class="muted">If you want changes to the layout, badges or additional screenshots, tell me — I will update it.</div>
    </footer>

  </div>
</body>
</html>
