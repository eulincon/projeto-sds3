import BarCharts from 'components/BarCharts'
import DataTable from 'components/DataTable'
import DonutChart from 'components/DonutsChart'
import Footer from 'components/Footer'
import NavBar from 'components/Navbar'

function App() {
	return (
		<>
			<NavBar />
			<div className='container'>
				<h1 className='text-primary_ py-3'>Dashboard de vendas</h1>
				<div className='row px-3'>
					<div className='col-sm-6'>
						<h5 className='text-center text-secondary'>Taxa de sucesso (%)</h5>
						<BarCharts />
					</div>
					<div className='col-sm-6'>
						<h5 className='text-center text-secondary'>Todas vendas</h5>
						<DonutChart />
					</div>
				</div>

				<div className='py-3'>
					<h2 className='text-primary_'>Todas vendas</h2>
				</div>

				<DataTable />
			</div>
			<Footer />
		</>
	)
}

export default App
